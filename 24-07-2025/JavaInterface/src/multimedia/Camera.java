package multimedia;

public class Camera implements Recordable, Streamable {

	@Override
	public void stream() {
		System.out.println("Camera Streaming live video");

	}

	@Override
	public void record() {
		System.out.println("Camera recording video");

	}

}
