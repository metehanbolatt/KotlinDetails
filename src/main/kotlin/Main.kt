fun main() {
    val teamList = arrayListOf(
        "Arsenal",
        "Manchester United",
        "Manchester City",
        "Chelsea",
        "Liverpool",
        "Southampton",
        "Tottenham"
    )
    val emptyList = ArrayList<String>()
    println(data(teamList))
    println(data2(emptyList))
    println(data3(teamList))

}

fun data(teamList: ArrayList<String>): List<String> {
    return if (teamList.isEmpty()) {
        emptyList()
    }else {
        teamList
    }
}

fun data2(teamList: ArrayList<String>): List<String> {
    return if (teamList.isEmpty()) {
        emptyList()
    }else {
        teamList
    }
}

fun data3(teamList: ArrayList<String>): List<String> {
    return teamList.ifEmpty { emptyList() }
}