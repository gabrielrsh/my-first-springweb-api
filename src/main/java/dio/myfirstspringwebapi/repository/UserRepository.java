package dio.myfirstspringwebapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.myfirstspringwebapi.handler.BusinessException;
import dio.myfirstspringwebapi.handler.CampoObrigatorioException;
import dio.myfirstspringwebapi.model.User;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getLogin()== null)
            throw new CampoObrigatorioException("login");
        if(user.getPassword()== null)
            throw new CampoObrigatorioException("password");
        if(user.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else    
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(user);    
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("LIST - Listando os usuarios do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("exemplo", "123"));
        users.add(new User("exemplo2", "321"));
        return users;
    }

    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuario", id));
        return new User("exemplo3", "456");
    }

    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuario", username));
        return new User("exemplo4", "654");
    }
}
