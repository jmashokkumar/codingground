class P_Classextends(val p_sno:Int, val p_sname:String, val p_m1:Int, val p_m2:Int)
    {
        var sno:Int = p_sno
        var sname:String = p_sname
        var m1:Int = p_m1
        var m2:Int = p_m2
        
    def calcGrade(csno:Int, csname:String, cm1:Int, cm2:Int)
    {
        var total:Int = cm1+cm2
        if ((total/2).toInt >= 90)
            println(sno+" has secured Grade A")
        else if ( ( ((total/2).toInt) >=80) && (((total/2).toInt) <90) ) 
            println(sno+" has secured Grade B")
        else
            println(sno+" has secured Grade C")
    }
    
    }
    
class calcGradeAll(override val p_sno:Int, override val p_sname:String, override val p_m1:Int, override val p_m2:Int,  val p_m3:Int)    
    extends P_Classextends(p_sno,p_sname,p_m1,p_m2)
    {
        var m3:Int = p_m3
        
     def calcGrade(csno:Int, csname:String, cm1:Int, cm2:Int, cm3:Int)
    {
        
        var total:Int = m1+m2+m3
        
        if ((total/3).toInt >= 90)
            println(sno+" has secured Grade A")
        else if ( ( ((total/3).toInt) >=80) && (((total/3).toInt) <90) ) 
            println(sno+" has secured Grade B")
        else
            println(sno+" has secured Grade C")
    }
    }
    
object Grade
    {
        def main(args: Array[String])
        {
            val stud1 = new calcGradeAll(100,"Name1",90,95,90)
            val stud2 = new P_Classextends(101,"Name2",89,88)
            val stud3 = new calcGradeAll(102,"Name3",79,77,78)
        }
    }