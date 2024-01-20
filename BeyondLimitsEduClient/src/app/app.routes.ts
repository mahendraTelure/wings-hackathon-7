import { Routes } from '@angular/router';
import { LandingComponent } from './landing/landing/landing.component';
import { AboutPageComponent } from './about-page/about-page.component';
import { UserLoginComponent } from './user/user-login/user-login.component';

export const routes: Routes = [

    { path: '', component: LandingComponent, pathMatch: 'full' },
    { path: 'about', component: AboutPageComponent, pathMatch: 'full' },
    {path: '/a', component: UserLoginComponent, pathMatch: 'full'}
];
