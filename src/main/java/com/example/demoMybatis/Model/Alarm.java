package com.example.demoMybatis.Model;

public class Alarm {
	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.id
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer id;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.rencent_alarms_include
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer rencentAlarmsInclude;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.intital_notification_evacuation
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private String intitalNotificationEvacuation;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.ending_notification_evacuation
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private String endingNotificationEvacuation;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.default_evacuation_length
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private String defaultEvacuationLength;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.man_down_notification
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private String manDownNotification;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.dissappears_after_mandown
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer dissappearsAfterMandown;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.man_down_movement_trigger
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Boolean manDownMovementTrigger;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.Trigger_movement_man_down
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer triggerMovementManDown;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.accelerometer_vector_man_down
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer accelerometerVectorManDown;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.X_axis_exceeds
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer xAxisExceeds;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.Y_axis_exceeds
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer yAxisExceeds;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.Z_axis_exceeds
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer zAxisExceeds;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.panic_notification
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private String panicNotification;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.dissappears_after_panic
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer dissappearsAfterPanic;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.dalily_notification
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private String dalilyNotification;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.alarm_response_panel
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Boolean alarmResponsePanel;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.zone_breach_time
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer zoneBreachTime;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.dissappears_after_zone_breach
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer dissappearsAfterZoneBreach;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column alarm.remove_from_alarm
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	private Integer removeFromAlarm;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.id
	 *
	 * @return the value of alarm.id
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.id
	 *
	 * @param id the value for alarm.id
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.rencent_alarms_include
	 *
	 * @return the value of alarm.rencent_alarms_include
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getRencentAlarmsInclude() {
		return rencentAlarmsInclude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.rencent_alarms_include
	 *
	 * @param rencentAlarmsInclude the value for alarm.rencent_alarms_include
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setRencentAlarmsInclude(Integer rencentAlarmsInclude) {
		this.rencentAlarmsInclude = rencentAlarmsInclude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.intital_notification_evacuation
	 *
	 * @return the value of alarm.intital_notification_evacuation
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public String getIntitalNotificationEvacuation() {
		return intitalNotificationEvacuation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.intital_notification_evacuation
	 *
	 * @param intitalNotificationEvacuation the value for
	 *                                      alarm.intital_notification_evacuation
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setIntitalNotificationEvacuation(String intitalNotificationEvacuation) {
		this.intitalNotificationEvacuation = intitalNotificationEvacuation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.ending_notification_evacuation
	 *
	 * @return the value of alarm.ending_notification_evacuation
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public String getEndingNotificationEvacuation() {
		return endingNotificationEvacuation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.ending_notification_evacuation
	 *
	 * @param endingNotificationEvacuation the value for
	 *                                     alarm.ending_notification_evacuation
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setEndingNotificationEvacuation(String endingNotificationEvacuation) {
		this.endingNotificationEvacuation = endingNotificationEvacuation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.default_evacuation_length
	 *
	 * @return the value of alarm.default_evacuation_length
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public String getDefaultEvacuationLength() {
		return defaultEvacuationLength;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.default_evacuation_length
	 *
	 * @param defaultEvacuationLength the value for alarm.default_evacuation_length
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setDefaultEvacuationLength(String defaultEvacuationLength) {
		this.defaultEvacuationLength = defaultEvacuationLength;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.man_down_notification
	 *
	 * @return the value of alarm.man_down_notification
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public String getManDownNotification() {
		return manDownNotification;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.man_down_notification
	 *
	 * @param manDownNotification the value for alarm.man_down_notification
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setManDownNotification(String manDownNotification) {
		this.manDownNotification = manDownNotification;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.dissappears_after_mandown
	 *
	 * @return the value of alarm.dissappears_after_mandown
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getDissappearsAfterMandown() {
		return dissappearsAfterMandown;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.dissappears_after_mandown
	 *
	 * @param dissappearsAfterMandown the value for alarm.dissappears_after_mandown
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setDissappearsAfterMandown(Integer dissappearsAfterMandown) {
		this.dissappearsAfterMandown = dissappearsAfterMandown;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.man_down_movement_trigger
	 *
	 * @return the value of alarm.man_down_movement_trigger
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Boolean getManDownMovementTrigger() {
		return manDownMovementTrigger;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.man_down_movement_trigger
	 *
	 * @param manDownMovementTrigger the value for alarm.man_down_movement_trigger
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setManDownMovementTrigger(Boolean manDownMovementTrigger) {
		this.manDownMovementTrigger = manDownMovementTrigger;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.Trigger_movement_man_down
	 *
	 * @return the value of alarm.Trigger_movement_man_down
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getTriggerMovementManDown() {
		return triggerMovementManDown;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.Trigger_movement_man_down
	 *
	 * @param triggerMovementManDown the value for alarm.Trigger_movement_man_down
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setTriggerMovementManDown(Integer triggerMovementManDown) {
		this.triggerMovementManDown = triggerMovementManDown;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.accelerometer_vector_man_down
	 *
	 * @return the value of alarm.accelerometer_vector_man_down
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getAccelerometerVectorManDown() {
		return accelerometerVectorManDown;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.accelerometer_vector_man_down
	 *
	 * @param accelerometerVectorManDown the value for
	 *                                   alarm.accelerometer_vector_man_down
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setAccelerometerVectorManDown(Integer accelerometerVectorManDown) {
		this.accelerometerVectorManDown = accelerometerVectorManDown;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.X_axis_exceeds
	 *
	 * @return the value of alarm.X_axis_exceeds
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getxAxisExceeds() {
		return xAxisExceeds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.X_axis_exceeds
	 *
	 * @param xAxisExceeds the value for alarm.X_axis_exceeds
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setxAxisExceeds(Integer xAxisExceeds) {
		this.xAxisExceeds = xAxisExceeds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.Y_axis_exceeds
	 *
	 * @return the value of alarm.Y_axis_exceeds
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getyAxisExceeds() {
		return yAxisExceeds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.Y_axis_exceeds
	 *
	 * @param yAxisExceeds the value for alarm.Y_axis_exceeds
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setyAxisExceeds(Integer yAxisExceeds) {
		this.yAxisExceeds = yAxisExceeds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.Z_axis_exceeds
	 *
	 * @return the value of alarm.Z_axis_exceeds
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getzAxisExceeds() {
		return zAxisExceeds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.Z_axis_exceeds
	 *
	 * @param zAxisExceeds the value for alarm.Z_axis_exceeds
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setzAxisExceeds(Integer zAxisExceeds) {
		this.zAxisExceeds = zAxisExceeds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.panic_notification
	 *
	 * @return the value of alarm.panic_notification
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public String getPanicNotification() {
		return panicNotification;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.panic_notification
	 *
	 * @param panicNotification the value for alarm.panic_notification
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setPanicNotification(String panicNotification) {
		this.panicNotification = panicNotification;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.dissappears_after_panic
	 *
	 * @return the value of alarm.dissappears_after_panic
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getDissappearsAfterPanic() {
		return dissappearsAfterPanic;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.dissappears_after_panic
	 *
	 * @param dissappearsAfterPanic the value for alarm.dissappears_after_panic
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setDissappearsAfterPanic(Integer dissappearsAfterPanic) {
		this.dissappearsAfterPanic = dissappearsAfterPanic;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.dalily_notification
	 *
	 * @return the value of alarm.dalily_notification
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public String getDalilyNotification() {
		return dalilyNotification;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.dalily_notification
	 *
	 * @param dalilyNotification the value for alarm.dalily_notification
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setDalilyNotification(String dalilyNotification) {
		this.dalilyNotification = dalilyNotification;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.alarm_response_panel
	 *
	 * @return the value of alarm.alarm_response_panel
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Boolean getAlarmResponsePanel() {
		return alarmResponsePanel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.alarm_response_panel
	 *
	 * @param alarmResponsePanel the value for alarm.alarm_response_panel
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setAlarmResponsePanel(Boolean alarmResponsePanel) {
		this.alarmResponsePanel = alarmResponsePanel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.zone_breach_time
	 *
	 * @return the value of alarm.zone_breach_time
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getZoneBreachTime() {
		return zoneBreachTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.zone_breach_time
	 *
	 * @param zoneBreachTime the value for alarm.zone_breach_time
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setZoneBreachTime(Integer zoneBreachTime) {
		this.zoneBreachTime = zoneBreachTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.dissappears_after_zone_breach
	 *
	 * @return the value of alarm.dissappears_after_zone_breach
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getDissappearsAfterZoneBreach() {
		return dissappearsAfterZoneBreach;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.dissappears_after_zone_breach
	 *
	 * @param dissappearsAfterZoneBreach the value for
	 *                                   alarm.dissappears_after_zone_breach
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setDissappearsAfterZoneBreach(Integer dissappearsAfterZoneBreach) {
		this.dissappearsAfterZoneBreach = dissappearsAfterZoneBreach;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column alarm.remove_from_alarm
	 *
	 * @return the value of alarm.remove_from_alarm
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public Integer getRemoveFromAlarm() {
		return removeFromAlarm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column alarm.remove_from_alarm
	 *
	 * @param removeFromAlarm the value for alarm.remove_from_alarm
	 *
	 * @mbg.generated Wed Jun 02 11:01:25 ICT 2021
	 */
	public void setRemoveFromAlarm(Integer removeFromAlarm) {
		this.removeFromAlarm = removeFromAlarm;
	}
}