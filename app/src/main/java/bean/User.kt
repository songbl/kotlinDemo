package bean

//? 用于解除非空限制；就像Java一样了
//?. 非空成立再调用
/**
 * var view: View? = null
 * view.setBackgroundColor(Color.RED)
 * 👆这样写会报错，Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type View?。
 * 所以使用 ?. 调用
 * 
 *例如： view?.setBackgroundColor(Color.RED)
 */
class User {
    var name :String ?= null
    var age :String ?= null

    get() {
        return field+"牛逼"
    }
    set(value) {
        field = "set "+value
    }

    //Unit返回类型可以省略（类比void，只是不省略）
    fun test() : Unit{
        print("哈哈 测试")
    }

}