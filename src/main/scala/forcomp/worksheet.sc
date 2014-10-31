package forcomp

object worksheet {
	val k = List(('a', 2), ('b', 2))          //> k  : List[(Char, Int)] = List((a,2), (b,2))
	val j = ('a', 2)                          //> j  : (Char, Int) = (a,2)
	
	(1 to j._2) map (c => List((j._1, c)))    //> res0: scala.collection.immutable.IndexedSeq[List[(Char, Int)]] = Vector(List
                                                  //| ((a,1)), List((a,2)))
}