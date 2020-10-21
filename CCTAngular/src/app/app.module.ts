import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { ProductComponent } from './app.productcomponent';
import { ShowProductComponent } from './app.showproductcomponent';
import { FormsModule } from '@angular/forms';

@NgModule({
    imports: [
        BrowserModule,
        FormsModule
    ],
    declarations: [
        AppComponent,
        ProductComponent,
        ShowProductComponent
		], 
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }