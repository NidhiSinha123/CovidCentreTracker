import { Component, NgModule} from '@angular/core';
import { AdminHomeComponent } from '../admin/app.adminhomecomponent';
import { HomeComponent } from '../home/app.homecomponent';
import { UserComponent } from './app.usercomponent';
import { LoginComponent } from '../login/app.logincomponent';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
    declarations: [
        UserComponent,
        HomeComponent,
        AdminHomeComponent,
        LoginComponent        
    ],
    imports: [
        HttpClientModule,
        FormsModule,
        ReactiveFormsModule,
    ],
    providers: [],
    entryComponents: [
        
    ]
})
export class UserModule  {}