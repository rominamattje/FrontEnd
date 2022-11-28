import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private http: HttpClient) { };
  title = 'ProyectoFinal';

  ngOnInit() {
    this.http.get('localhost:4200').
      subscribe((data) => {
        console.log(data);
      });

    }
  }
