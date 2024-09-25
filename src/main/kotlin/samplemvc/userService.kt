package samplemvc

import org.springframework.stereotype.Service


data class User(val id: Int, val name: String, val email: String)

@Service
class UserService{
    fun getUser(): User {
        return User(1, "John", "shanu@123")
    }
}