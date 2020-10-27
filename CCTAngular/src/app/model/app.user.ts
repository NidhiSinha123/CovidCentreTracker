import { Component} from '@angular/core';

@Component({
    selector: 'user',
    templateUrl: 'app.usercomponent.html'
})

export class UserComponent  {
    city: any;

    constructor (){
        this.city = "Mumbai";
    }

}