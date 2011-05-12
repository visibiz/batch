package com.visibiz.jobs


class AppStatsJob {
    
    // WHAT DOES THIS TIMEOUT DO????
    def timeout = 5000l // execute job once in 5 seconds
    
    // Don't need Hibernate session
    def sessionRequired = false
    
    static triggers = {
        // Repeat every hour
        simple name:'repeatEveryFiveSeconds', startDelay:10000, repeatInterval: 5000
//        cron name:'cronTrigger', startDelay:10000, cronExpression: '0/6 * 15 * * ?'
//        custom name:'customTrigger', triggerClass:MyTriggerClass, myParam:myValue, myAnotherParam:myAnotherValue
    }
 
    def execute(context) {
        println("${new Date()}: AppStats")
//        println("${new Date()}: AppStats - context: $context")
    }
}
