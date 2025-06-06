package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BusinessDayServiceTest {
	BusinessDayService service = new BusinessDayService();

	// TODO Hands-On 1-1
	@Test
	void testlsBusinessDay() {
		boolean actual = service.isBusinessDay(LocalDate.of(2022, 10, 20));
		assertTrue(actual);
	}
	
	// TODO Hands-On 1-2
	@Test
	void testHolidayNotBusinessDay() {
		boolean actual = service.isBusinessDay(LocalDate.of(2022, 11, 3));
		assertFalse(actual);
	}
	// TODO Hands-On 2-2
	@Test
	void testSaturdayNotBusinessDay() {
		boolean actual = service.isBusinessDay(LocalDate.of(2022, 12, 17));
		assertFalse(actual);
	}
	// TODO Hands-On 1-2
	@Test
	void testSundayNotBusinessDay() {
		boolean actual = service.isBusinessDay(LocalDate.of(2022, 12, 25));
		assertFalse(actual);
	}
	// TODO Hands-On 3-1
	@Test
	void testGetNextBusinessDaylsNull() {
		LocalDate actual = service.getNextBusinessDay(LocalDate.of(2022, 8, 11), 5);
		assertNull(actual);
	}
	// TODO Hands-On 3-2
	@Test
	void testGetNextBusinessDay() {
		LocalDate expected = LocalDate.of(2022, 9, 26);
		LocalDate actual = service.getNextBusinessDay(LocalDate.of(2022, 9, 23), 5);
		assertNotNull(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	void testGetBusinessDayArray() {
		LocalDate[] expected = new LocalDate[] {
				LocalDate.of(2022, 10, 7),
				LocalDate.of(2022, 10, 11),
				LocalDate.of(2022, 10, 12)
		};
		LocalDate[] actual = service.getBusinessDayArray(LocalDate.of(2022, 10, 7), 5);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testGetBusinessDayList() {
		List<LocalDate> expected = Arrays.asList(
				LocalDate.of(2022, 10, 7),
				LocalDate.of(2022, 10, 11),
				LocalDate.of(2022, 10, 12));
		List<LocalDate> actual = service.getBusinessDayList(LocalDate.of(2022, 10, 7), 5);

		assertIterableEquals(expected, actual);
	}
}
