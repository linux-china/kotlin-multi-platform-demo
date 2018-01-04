package org.mvnsearch.common

fun main(args: Array<String>) {
    val repo: AccountRepo = AccountRepoImpl()
    println(repo.findById(1L))
}