/*
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.employees;

import com.clover.sdk.v3.employees.Employee;
import com.clover.sdk.v3.employees.IEmployeeListener;
import com.clover.sdk.v1.ResultStatus;

/**
 * An interface for interacting with the Clover employee service. The employee
 * service is a bound AIDL service. Bind to this service as follows,
 * <pre>
 * <code>
 * Intent serviceIntent = new Intent(EmployeeIntent.ACTION_EMPLOYEE_SERVICE);
 * serviceIntent.putExtra(EmployeeIntent.EXTRA_ACCOUNT, CloverAccount.getAccount(context));
 * serviceIntent.putExtra(EmployeeIntent.EXTRA_VERSION, 1);
 * context.bindService(serviceIntent);
 * </code>
 * </pre>
 * For more information about bound services, refer to
 * the Android documentation:
 * <a href="http://developer.android.com/guide/components/bound-services.html#Binding">
 * Bound Services
 * </a>.
 * <br/><br/>
 * You may also interact with the employee service through the
 * {@link com.clover.sdk.v1.employee.EmployeeConnector} class, which handles binding and
 * asynchronous invocation of service methods.
 *
 * @see com.clover.sdk.v1.employee.EmployeeIntent
 * @see com.clover.sdk.util.CloverAccount
 * @see com.clover.sdk.v1.employee.EmployeeConnector
 */
interface IEmployeeService {
    Employee getActiveEmployee(out ResultStatus resultStatus);

    Employee getEmployee(String id, out ResultStatus resultStatus);

    List<Employee> getEmployees(out ResultStatus resultStatus);

    Employee createEmployee(in Employee employee, out ResultStatus resultStatus);

    Employee updateEmployee(in Employee employee, out ResultStatus resultStatus);

    Employee setEmployeePin(String id, String pin, out ResultStatus resultStatus);

    void deleteEmployee(String id, out ResultStatus resultStatus);

    void logout(out ResultStatus resultStatus);

    void login(out ResultStatus resultStatus);

    void addListener(IEmployeeListener listener, out ResultStatus resultStatus);

    void removeListener(IEmployeeListener listener, out ResultStatus resultStatus);
}
