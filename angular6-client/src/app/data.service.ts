import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getFatherFromFamilyId(familyId){
  return this.http.get('http://localhost:8080/father/findbyfamily/'+familyId)
  }

  getChildFromFamilyId(familyId){
    return this.http.get('http://localhost:8080/child/findbyfamily/'+familyId)
  }
  getFamily(id, obFather, obChild){
    this.getFatherFromFamilyId(id);
    this.getChildFromFamilyId(id);
  }

  getFather(){
    return this.http.get('http://localhost:8080/father');
  }

  getChildren(){
    return this.http.get('http://localhost:8080/child');
  }

  addFather(model){
    return this.http.post('http://localhost:8080/father',model);
  }
  addChild(model){
    return this.http.post('http://localhost:8080/child',model);
  }

}
