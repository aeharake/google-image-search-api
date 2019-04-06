<h2>About</h2>

This is a client-side library intended for developers who would like to retrieve google images without using Google's API.

<h2>Example</h2>

Let's search for a Ferrari with some criteria (Size: Medium, Color: Yellow, Published: Last week).

**1)** Create the `ToolsBuilder` responsible for setting these criteria:

```
Tools.ToolsBuilder toolsBuilder = new Tools.ToolsBuilder();
```


**2)** Let's build the `Tools` object from these criteria (size,color,date published) 

```
Tools tools = toolsBuilder.color(Tools.ColorConstants.YELLOW).size().medium().time().lastWeek().build();
```


**3)** Now let's initialize our `GoogleCall` which takes two arguments: keywords and tools. Since we have our `tools` ready, we need to set our `keywords` value and initialize our `call`.

	a) set the keywords:

	```
	String keywords = "ferrari"; //it can also contain multiple words like "sexy ferrari"
	```

	b) initialize our call:

	```
	GoogleCall call = new GoogleCall(keywords, tools);
	```
	

**4)** Once our `call` is ready, execute it and wait for the response:

```
call.execute(new GoogleCall.Callback() {

  @Override
  public void onResponse(ArrayList<GoogleImageModel> googleImages) {
	//Now you have all the google images
  }

  @Override
  public void onFailure(Exception ex) {
		///Connection problem, or unable to parse response.
  }
});
```

<h2>Note</h2>
The library is very straight-forward and very easy to use as it's implemented using the step-builder pattern.
