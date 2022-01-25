package com.example.replikalivin.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue

@MapKey
@Target(AnnotationTarget.FUNCTION)
annotation class ViewModelMapKey(val value: KClass<out ViewModel>)