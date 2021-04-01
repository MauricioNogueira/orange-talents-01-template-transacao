package br.com.zup.handle

import io.grpc.StatusRuntimeException
import io.micronaut.context.annotation.Requirements
import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.exceptions.ExceptionHandler
import io.micronaut.http.server.exceptions.response.ErrorResponseProcessor
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Produces
@Singleton
@Requirements(
    Requires(classes = [StatusRuntimeException::class, ExceptionHandler::class])
)
class GlobalExceptionHandle(private val errorResponseProcessor: ErrorResponseProcessor<Any>): ExceptionHandler<StatusRuntimeException, HttpResponse<*>> {

    val logger = LoggerFactory.getLogger(this.javaClass)

    override fun handle(request: HttpRequest<*>?, exception: StatusRuntimeException?): HttpResponse<*> {


        val status = when(exception!!.status.code.name) {
            "ALREADY_EXISTS" -> HttpStatus.UNPROCESSABLE_ENTITY
            "INVALID_ARGUMENT_VALUE" -> HttpStatus.BAD_REQUEST
            else -> HttpStatus.INTERNAL_SERVER_ERROR
        }

        return HttpResponse.status<String>(status).body(exception.status)
    }

}