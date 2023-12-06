package com.app.test.domain.search.models

sealed class RequestState<out T : Any> {

    data class SuccessState<out T : Any>(val data: T) : RequestState<T>()

    data class FailureState(val error: Throwable) : RequestState<Nothing>()
}