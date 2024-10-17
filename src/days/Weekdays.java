/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public enum Weekdays {
    MONDAY {
        @Override
        public String toString() {
            return "Monday";
        }
    },
    TUESDAY {
        @Override
        public String toString() {
            return "Tuesday";
        }
    },
    WEDNESDAY {
        @Override
        public String toString() {
            return "Wednesday";
        }
    },
    THURSDAY {
        @Override
        public String toString() {
            return "Thursday";
        }
    },
    FRIDAY {
        @Override
        public String toString() {
            return "Friday";
        }
    },
    SATURDAY {
        @Override
        public String toString() {
            return "Saturday";
        }
    },
    SUNDAY {
        @Override
        public String toString() {
            return "Sunday";
        }
    }
}