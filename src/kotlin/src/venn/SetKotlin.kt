package venn

class SetKotlin(vararg s:Int) {

    // propreties
    // TODO : List should e immutable
    private var elements: List<Int> = s.toList()

    constructor(list: List<Int>): this() {
        elements = list
    }

    /**
     * Return interesection of two Set
     * // TODO : Should do with unlimited number of Set in params
     */
    fun Intersection(B: SetKotlin):SetKotlin {
        val A: SetKotlin = this
        val builder = Builder()

        for(eA in A.elements) {
            for(eB in B.elements) {
                if(eA == eB) builder.add(eA)
            }
        }
        return builder.build()
    }

    /**
     * Return union of two Set
     */
    fun union(B: SetKotlin):SetKotlin {
        val A: SetKotlin = this
        val builder = Builder()
        for(eA in A.elements) builder.add(eA)
        for(eB in B.elements) builder.add(eB)
        return builder.build()
    }

    /**
     * Return interesection of two Set
     * // TODO : Should do with unlimited number of Set in params
     */
    fun difference(B: SetKotlin):SetKotlin {
        val AMutableSet: MutableSet<Int> = this.elements.toMutableSet()
        val BMutableSet: MutableSet<Int> = B.elements.toMutableSet()

        val iterator = AMutableSet.iterator()
        while(iterator.hasNext()) {
            val n = iterator.next()
            for(eB in BMutableSet) {
                if(n == eB) {
                    iterator.remove()
                }
            }
        }

        return SetKotlin(AMutableSet.toList())
    }


    override fun toString(): String {
        var output: String = "{ "
        for((i, e) in elements.withIndex())
            output += if(i + 1 != elements.size) e.toString() + " / " else e
        output += " }"
        return output
    }

    class Builder {

        private val list: MutableSet<Int> = mutableSetOf()


        fun add(e: Int):Builder { list.add(e); return this }

        fun build():SetKotlin {
            return SetKotlin(list.toList())
        }
    }
}