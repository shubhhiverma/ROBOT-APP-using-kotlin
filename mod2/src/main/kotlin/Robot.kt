class Robot(var name:String) {
    final var week: Array<String> =arrayOf<String>("monday","tuesday","wednesday","thursday","friday","saturday","sunday")
    fun alarm(time:String,day:String) {
        if (day == week[6]) {
            println("Its holiday ")
        } else {
            println("wake up its already time !! Its $time ")
        }
    }
    fun coffee(type:String,sugar:Int)
    {
        println("here is your $type coffee with $sugar grams sugar ")
    }
    fun water(temp:Int)
    {
        println("I have heated the water and its temperature is now $temp degree Celsius as ordered")
    }
    fun bag(day:String)
    {
     var subject= listOf<String>("maths","physics","chemistry","english","computers")
      var sub=mutableListOf<String>()
        if (day == week[0]) {
           sub.add(subject[0])
            sub.add(subject[1])
        }
        if(day==week[1]||day==week[3]||day==week[5])
        {
            sub.add(subject[0])
            sub.add(subject[1])
            sub.add(subject[3])
        }
        if(day==week[2]||day==week[4])
        {
            sub.add(subject[2])
            sub.add(subject[3])
        }
    }
    fun food()
    {
        var item=listOf<String>("chola bhatoora","sushi","aalo ka paratha","paneer sbzi","dosa")
        var s=item.random()
        println("I have made $s for you")
    }
    fun iron(cloth:String)
    {
        println("I have ironed $cloth for you to wear.")
    }
}

