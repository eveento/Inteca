import { Component, OnInit } from '@angular/core';
import { Father } from '../models/father.model';
import { Child } from '../models/child.model';
import { DataService } from '../data.service';


@Component({
  selector: 'app-form-data',
  templateUrl: './form-data.component.html',
  styleUrls: ['./form-data.component.scss']
})
export class FormDataComponent implements OnInit {

  fatherModel = new Father(null,"","","","");
  childModel = new Child(null,"","","","","");

  constructor(private data: DataService) { }

  ngOnInit() {} 

    get currentFamily(){
      return console.log(JSON.stringify(this.fatherModel));
    }

    sendFather(){
      this.data. addFather(this.fatherModel).subscribe(
        data => this.fatherModel);
        console.log(this.data);
    }
    sendChild(){
      this.data. addChild(this.childModel).subscribe(
        data => this.childModel);
        console.log(this.data);
    }
}
