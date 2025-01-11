```groovy
class MyClass {
    def myMethod(String arg = "") {
        if (arg == null) {
            arg = ""
        }
        return "Method executed with argument: "+ arg
    }
}

MyClass myObject = new MyClass()
println myObject.myMethod(null) //Output: Method executed with argument: 
println myObject.myMethod("Hello") //Output: Method executed with argument: Hello
println myObject.myMethod() //Output: Method executed with argument: 
```