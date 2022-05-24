import { Injectable } from "@angular/core";

@Injectable({
  providedIn: "root",
})
export class ApiUriService {
  constructor() {}

  readonly SIGNUP_API_URI: string =
    "http://ec2-18-233-29-224.compute-1.amazonaws.com/auth/signup";

  readonly LOGIN_API_URI: string =
    "http://ec2-18-233-29-224.compute-1.amazonaws.com/auth/login";

  readonly PROCESS_COMPONENT_API_URI: string =
    "http://ec2-18-233-29-224.compute-1.amazonaws.com/component-process/process-request";

  readonly CONFIRM_ORDER_API_URI: string =
    "http://ec2-18-233-29-224.compute-1.amazonaws.com/component-process/complete-processing";
}
