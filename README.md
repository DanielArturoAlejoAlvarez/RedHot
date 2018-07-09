# REDHOT
## Description

This repository is a Android App with Kotlin.

## Installation
Using Kotlin Version 1.2.51 preferably.

## Apps
Using Android Studio 3.1.3 for Linux.

## Usage
```html
$ git clone https://github.com/DanielArturoAlejoAlvarez/RedHot.git [NAME APP] 

```
Follow the following steps and you're good to go! Important:


![alt text](https://upload.wikimedia.org/wikipedia/commons/0/08/Kotlin_in_IntelliJ_Idea_-_parameters_hints.gif)


## Coding

```kotlin
...
fun switchCurso(curso: Cursos){
        var cursoDafault = curso.copy()
        when(curso.url){
            "react" -> cursoDafault = kot.copy()
            "kotlin" -> cursoDafault = react.copy()
            else -> print("This will never happen!")
        }
        verEnPantalla("${cursoDafault.nombre} Kotlin is a great fit for developing Android applications in: ${cursoDafault.url}")
    }
...
```

## Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/DanielArturoAlejoAlvarez/RedHot. This project is intended to be a safe, welcoming space for collaboration, and contributors are expected to adhere to the [Contributor Covenant](http://contributor-covenant.org) code of conduct.


## License

The gem is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).