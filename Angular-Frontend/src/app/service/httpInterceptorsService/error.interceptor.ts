import { Injectable } from '@angular/core'
import { HttpRequest, HttpHandler, HttpEvent, HttpInterceptor, HttpErrorResponse } from '@angular/common/http'
import { catchError, EMPTY, Observable, throwError } from 'rxjs'
import { DataService } from '../data.service'

@Injectable({
  providedIn: 'root',
})
export class ErrorInterceptor implements HttpInterceptor {
  constructor(private dataService: DataService) {}

  intercept(request: HttpRequest<any>, next: HttpHandler) {
    console.log('inteceptor')
    return next.handle(request).pipe(
      catchError((error: HttpErrorResponse) => {
        this.dataService.setErrorData(error.error, error.status)
        console.log(this.dataService.getErrorData())
        return EMPTY
      })
    )
  }
}
