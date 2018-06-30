import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { Observable } from 'rxjs';
import { ActivatedRoute } from '@angular/router';
import { Child } from '../models/child.model';
import { Father } from '../models/father.model';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.scss']
})
export class DetailsComponent implements OnInit {

  father$: Object;
  child$: Object;
  idfamily: number;
  showFamilyMembers: boolean;

  constructor(private data: DataService, private route: ActivatedRoute) {
   }

  ngOnInit() {
    this.showFamilyMembers=false;
  }

getFamimy(){
  this.data.getFatherFromFamilyId(this.idfamily).subscribe(data =>this.father$=data)
  this.data.getChildFromFamilyId(this.idfamily).subscribe(data =>this.child$=data)
  this.showFamilyMembers=true;
}

}
