 
listView('ERERERERER2 Jobs') {
    description('ERERERERER2 Jobs')
    jobs {
        regex('ERERERERER2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
