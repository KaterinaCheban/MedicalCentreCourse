package com.med.medicalcentrecourse.restControllers;

import com.med.medicalcentrecourse.model.Appointment;
import com.med.medicalcentrecourse.service.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AppointmentController {
    private final AppointmentService appointmentService;
    @GetMapping("/appointmentbefore")
    @ResponseStatus(HttpStatus.OK)
    public List<Appointment> getAllAppointment(){
        return appointmentService.getAllAppointmentBeforeNow();
    }
//    @PutMapping("/appointment/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public Appointment refreshDoctor(@PathVariable("id") Integer id, @RequestBody Appointment appointment){
//        return  getAppointmentForDoctorAndPatient(
//                appointmentService.updateById(id,appointment));
//    }
//    //Удаление по id
//    @PatchMapping("/appointment/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void removeEmployeeById(@PathVariable Integer id) {
//        appointmentService.removeById(id);
//    }
//
//    //Удаление всех юзеров
//    @DeleteMapping("/appointment")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void removeAllUsers() {
//        appointmentService.removeAll();
//    }
//    @PostMapping("/appointment")
//    @ResponseStatus(HttpStatus.OK)
//    public Appointment createAppointment(@RequestBody @Valid Appointment appointment){
//        return
//                appointmentService.create(appointment);
//    }
//    @GetMapping("/appointment/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public Appointment getAppointmentByID(@PathVariable("id") Integer id){
//        return appointmentService.getAppointmentByID(id);
//    }
//    @GetMapping("/appointment")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Appointment> getAllAppointment(){
//        return appointmentService.getALlAppointment();
//    }
//    @GetMapping("/appointments/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Appointment> getAppointmentByPersonId(@PathVariable("id") Integer id){
//        return appointmentService.getAppointmentByPersonID(id);
//    }
//    @GetMapping("diagnosis/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public Set<String> getAllDiagnosis(@PathVariable("id") Integer id){
//        return appointmentService.getAllDiagnoseByPatientID(id);
//    }
//    //Службовий метод
//    private Appointment getAppointmentForDoctorAndPatient(Appointment appointment1){
//        Doctor doctor = doctorServiceBean.getDoctorByID(appointment1.getDoctors().getId());
//        Patient patient = patientsServiceBean.getPatientByID(appointment1.getPatients().getId());
//        return new Appointment(
//                appointment1.getId(),
//                patient,
//                doctor,
//                appointment1.getActionTime(),
//                appointment1.getDiagnosis()
//        );
//    }
}
