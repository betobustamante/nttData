package com.nttdata.pt1.controller;

import com.nttdata.pt1.exception.BusinessException;
import com.nttdata.pt1.model.User;
import com.nttdata.pt1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.nttdata.pt1.util.ExpertString;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public User getUserById(@RequestParam(required = false) String idType, @RequestParam(required = false) String idNumber){
        User user = new User();
        if(ExpertString.isEmptyOrNull(idType) || ExpertString.isEmptyOrNull(idNumber)){
            throw new BusinessException("E-101", HttpStatus.BAD_REQUEST,"Lo sentimos, ha ocurrido un error en la solicitud. Algunos de los datos proporcionados son inválidos o están en un formato incorrecto. Por favor, revisa tus datos e intenta nuevamente.");
        }
        if(ExpertString.valIdType(idType)){
            throw new BusinessException("E-102", HttpStatus.BAD_REQUEST,"Lo sentimos, ha ocurrido un error en la solicitud. Algunos de los datos proporcionados son inválidos o están en un formato incorrecto. Por favor, revisa tus datos e intenta nuevamente.");
        }

        try{
            return userService.getUserbyId(idNumber);
        }catch (Exception ex){
            throw new BusinessException("E-103", HttpStatus.NOT_FOUND,"El usuario solicitado no existe");
        }

    }

}
