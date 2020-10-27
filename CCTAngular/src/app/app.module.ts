﻿import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UserComponent } from './user/app.usercomponent';

@NgModule({
    imports: [
        BrowserModule,
        FormsModule,
        HttpClientModule,
        FormsModule,
        UserComponent
    ],
    declarations: [
        AppComponent,
		], 
    providers: [ ],
    bootstrap: [AppComponent]
})



export class AppModule { }