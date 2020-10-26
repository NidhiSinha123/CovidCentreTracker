import { Component} from '@angular/core';

@Component({
    selector: 'login',
    templateUrl: 'app.logincomponent.html'
})

export class LoginComponent  {
    id: any;
    password: any;

    constructor (){
        this.id = "abc";
        this.password="abc123";
    }

}