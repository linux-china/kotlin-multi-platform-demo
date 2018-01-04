package org.mvnsearch.common

actual class AccountRepoImpl : AccountRepo {
    actual override fun findById(id: Long): Account {
        return Account(id = 1, name = "JVM")
    }
}