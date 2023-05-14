package trading;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * This class tests processSignal request with different signal configuration.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class SignalControllerTests {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testSignal1() throws Exception {
		mockMvc.perform(get("/processSignal?signal=1")).andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"))
				.andExpect(content().string("1 signal processed successfully."));
	}

	@Test
	public void testSignal2() throws Exception {
		mockMvc.perform(get("/processSignal?signal=2")).andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"))
				.andExpect(content().string("2 signal processed successfully."));
	}

	@Test
	public void testSignal3() throws Exception {
		mockMvc.perform(get("/processSignal?signal=3")).andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"))
				.andExpect(content().string("3 signal processed successfully."));
	}

	@Test
	public void testSignal0() throws Exception {
		mockMvc.perform(get("/processSignal?signal=0")).andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"))
				.andExpect(content().string("0 signal processed successfully."));
	}

	@Test
	public void testSignalEmpty() throws Exception {
		mockMvc.perform(get("/processSignal?signal=")).andExpect(status().is(400));

	}

	@Test
	public void testWithoutSignal() throws Exception {
		mockMvc.perform(get("/processSignal")).andExpect(status().is(400));
	}

}
