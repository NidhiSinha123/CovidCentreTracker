import {Component} from '@angular/core';

@Component({
    selector:'prod',
    templateUrl:'app.product.html'
})


export class ProductComponent{
    prodId:number = 1001;
    prodName:string = "Mobile";
    prodOnline:boolean = false;
    prodType:any = "yyyy";
    pic:string = "assets/call-to-action-bg.jpg"
    products:any[] = [
        {prodId:1001, prodName:"Mobile"},
        {prodId:1002, prodName:"Computer"},
        {prodId:1003, prodName:"Laptop"} 
    ];

    getAllData():any{
        alert(this.prodId + " " + this.prodName + " " + this.prodOnline + " " + this.prodType);
    }

    deleteData(prod:any):any{
        this.products.splice(this.products.indexOf(prod),1); 
    }
 }