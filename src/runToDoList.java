import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RunToDoList {
    public static void main(String[] args) {
        ToDoList myList = new ToDoList("Semana 6");
        myList.addActivity("Calificar", "Revisar y calificar parcial 1 POO");
        myList.addActivity("Subir notas", "Subir las notas de los estudiantes", LocalDate.now().plusDays(3));
        myList.addActivity("Grabar video", "Grabar video sobre Monetización de Apps");
        myList.addActivity("Reunión", "Reunión del equipo de calidad", LocalDate.of(2022, 5, 28));

        //Mi lista es compartida
        System.out.printf("Nombre: %s\n", myList.getName());
        System.out.print("Mi lista es compartida: ");
        if(myList.isShared()) {
            System.out.println("Sí, su lista es compartida");
        } else {
            System.out.println("No, su lista NO es compartida");
        }
        //simulacion
        myList.getActivities().get(0).setCompleted(true);

        //Mostrar actividades
        System.out.println("TODAS las Actividades: ");
        printActivities(myList.getActivities());

        //Msotrar actividades Completas
        System.out.println("Actividades completas: ");
        printActivities(getActCompleted(myList.getActivities()));
    }

    private static void printActivities(List<Activity> activities) {
        System.out.printf("%-3s\t%-15s\t%-50s\t%-10s\t%s\t%s\n",
                "#",
                "Nombre",
                "Descripción",
                "Completada",
                "F. creación",
                "F. alerta"
        );
        for(int i = 0; i < activities.size(); i ++ ){
            var activity = activities.get(i);
            if(activity.getRememberAt() != null) {
                System.out.printf("%-3d\t%-15s\t%-50s\t%-10B\t%5$td/%5$tm/%5$tY\t%6$td/%6$tm/%6$tY\n",
                        i,
                        activity.getName(),
                        activity.getDescription(),
                        activity.isCompleted(),
                        activity.getCreatedAt(),
                        activity.getRememberAt()
                );
            } else {
                System.out.printf("%-3d\t%-15s\t%-50s\t%-10B\t%5$td/%5$tm/%5$tY\tn.d\n",
                        i,
                        activity.getName(),
                        activity.getDescription(),
                        activity.isCompleted(),
                        activity.getCreatedAt()
                );
            }
        }
    }
    private static List<Activity> getActCompleted(List<Activity> activities){
        List <Activity> output = new ArrayList<>();
        for (var activity : activities){
            output.add(activity);

        }
    return output;
    }


}