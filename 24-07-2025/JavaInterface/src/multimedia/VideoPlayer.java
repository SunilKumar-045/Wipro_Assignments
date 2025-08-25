package multimedia;

public class VideoPlayer implements Playable, Streamable {

	@Override
	public void stream() {
		System.out.println("VideoPlayer Streaming video");

	}

	@Override
	public void play() {
		System.out.println("VideoPlayer Playing video");

	}

}
