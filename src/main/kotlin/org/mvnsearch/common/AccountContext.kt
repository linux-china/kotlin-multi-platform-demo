package org.mvnsearch.common

data class Account(var id: Long, var name: String)

interface AccountRepo {
    fun findById(id: Long): Account
}

expect class AccountRepoImpl constructor() : AccountRepo {
    override fun findById(id: Long): Account
}

