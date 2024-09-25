package samplemvc

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class UserController {

    @GetMapping("/user")
    fun getUser():User {
        return User(1, "John", "john@gmail.com")
    }
}