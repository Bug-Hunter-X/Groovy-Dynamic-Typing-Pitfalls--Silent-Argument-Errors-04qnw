```groovy
class MyClass {
    def myMethod(String arg) {
        if (arg == null) {
            return "Null value passed"
        }
        return "Method executed with argument: "+arg
    }
}

MyClass myObject = new MyClass()
println myObject.myMethod(null) //Output: Null value passed
println myObject.myMethod("Hello") //Output: Method executed with argument: Hello
println myObject.myMethod()
```