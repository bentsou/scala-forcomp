package forcomp
import Anagrams._

object worksheet {
	val o1 = wordOccurrences("larrd")         //> o1  : forcomp.Anagrams.Occurrences = List((a,1), (d,1), (l,1), (r,2))
	val o2 = wordOccurrences("ard")           //> o2  : forcomp.Anagrams.Occurrences = List((a,1), (d,1), (r,1))
	
	o1.toMap                                  //> res0: scala.collection.immutable.Map[Char,Int] = Map(a -> 1, d -> 1, l -> 1,
                                                  //|  r -> 2)
      
   
 subtract(o1, o2)                                 //> res1: forcomp.Anagrams.Occurrences = List((l,1), (r,1))
}