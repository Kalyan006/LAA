package com.phm.hec.utility;

import static com.google.common.base.Predicates.not;
import static com.phm.hec.utility.JQueryCalendar.Months.valueOf;
import static java.lang.Integer.parseInt;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.tagName;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.phm.hec.calendar.DatePicker.Calendar;

public class JQueryCalendar implements Calendar {
	
	public enum Months {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December;
    }
	
	 public JQueryCalendar(WebDriver webDriver, Function<WebDriver, WebElement> trigger) {
	        this.webDriver = webDriver;
	        this.trigger = trigger;
	    }
	 
	 private final WebDriver webDriver;
	 private final Function<WebDriver, WebElement> trigger;
	 
	 @Override
	    public void show() {
	        trigger.apply(webDriver).click();
	        new WebDriverWait(webDriver, 60).until(new CalendarIsDisplayed());
	    }
	 
	 @Override
	    public int currentYear() {
	        return parseInt(calendar().findElement(className("ui-datepicker-year")).getText());
	    }

	    @Override
	    public int currentMonth() {
	        return valueOf(
	                   calendar().findElement(className("ui-datepicker-month")).getText()
	               ).ordinal();
	    }

	    @Override
	    public void previousYear() {
	        for (int i = 0; i < 12; i++) {
	            previousMonth();
	        }
	    }

	    @Override
	    public void previousMonth() {
	        calendar().findElement(className("ui-datepicker-prev")).click();
	    }

	    @Override
	    public void nextYear() {
	        for (int i = 0; i < 12; i++) {
	            nextMonth();
	        }
	    }

	    @Override
	    public void nextMonth() {
	        calendar().findElement(className("ui-datepicker-next")).click();
	    }

	    @Override
	  
	    public void enterYear(int year) {
	        yearSelect().selectByVisibleText(String.valueOf(year));
	    }

	    private Select yearSelect() {
	        return new Select(webDriver.findElement(By.name("THE NAME OF THE SELECT OF YEAR")));
	    }
	    
	    @Override
	    public void enterMonth(Enum month) {
	        monthSelect().selectByVisibleText(month.name());
	    }
	    
	    private Select monthSelect() {
	        return new Select(webDriver.findElement(By.name("THE NAME OF THE SELECT OF MONTH")));
	    }

	    @Override
	    public void pickDay(int day) {
	        List<WebElement> dayButtons =
	                calendar().findElement(
	                        className("ui-datepicker-calendar")
	                ).findElements(tagName("td"));
	        for (WebElement dayButton : dayButtons) {
	            if (dayButton.getText().equals(String.valueOf(day))) {
	                dayButton.click();
	                new WebDriverWait(webDriver, 60).until(not(new CalendarIsDisplayed()));
	            }
	        }
	    }

	    private WebElement calendar() {
	        return webDriver.findElement(By.id("ui-datepicker-div"));
	    }
	    
	    private class CalendarIsDisplayed implements Predicate<WebDriver> {
	        @Override
	        public boolean apply(WebDriver webDriver) {
	            return calendar() != null && calendar().isDisplayed();
	        }
	    }    
	}

	

