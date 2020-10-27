import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";


const routes: Routes = [
    //{path: "login",  component: AutheticationComponent},
    // {
    //     path: "",
    //     loadChildren: () =>
    //     import("./user/app.user.module").then((module) => module.UserModule),
    //     canActivate: [AuthGuard],
    // },
    { path: "**", redirectTo: "/", pathMatch: "full" },
];

@NgModule({
    imports: [RouterModule.forRoot(routes, {useHash: true})],
    exports: [RouterModule], 
})

export class AppRoutingModule {}