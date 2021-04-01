package br.com.zup.validations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B6\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005R\u001b\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\tR\u000f\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\nR\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/validations/ValidPixKey;", "", "message", "", "groups", "", "Lkotlin/reflect/KClass;", "", "payload", "()[Ljava/lang/Class;", "()Ljava/lang/String;", "transacao"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.TYPE_USE})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Documented()
@kotlin.annotation.MustBeDocumented()
@javax.validation.ReportAsSingleViolation()
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.TYPE, kotlin.annotation.AnnotationTarget.CONSTRUCTOR})
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@org.hibernate.validator.constraints.ConstraintComposition(value = org.hibernate.validator.constraints.CompositionType.OR)
@javax.validation.constraints.Size(max = 2)
@org.hibernate.validator.constraints.br.CPF()
public abstract @interface ValidPixKey {
    
    public abstract java.lang.String message() default "valor de chave inv\u00e1lido";
    
    public abstract java.lang.Class<java.lang.Object>[] groups() default {};
    
    public abstract java.lang.Class<java.lang.Object>[] payload() default {};
}