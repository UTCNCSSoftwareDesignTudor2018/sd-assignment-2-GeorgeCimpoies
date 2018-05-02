package service;

import model.Activity;
import utils.HibernateUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class ActivityService {

    static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void addActivity(String operation) {

        Activity activity = new Activity();
        activity.setActivityId(UUID.randomUUID().hashCode());
        activity.setOperation(operation);
        activity.setUsername("Generic");
        activity.setDate(dateFormat.format(new Date()));

        HibernateUtil.addOrUpdate(activity);
    }

    public static void deleteActivity(int activityId) {
        HibernateUtil.deleteById(Activity.class, activityId);
    }
}
