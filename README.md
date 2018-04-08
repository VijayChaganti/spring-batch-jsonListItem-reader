# example-springbatch-jsonListItem-reader

This is to demo how to use Spring-Batch with

- A Reader to parse JSON as a List

In this example, we will parse a JSON file as a List of Objects and give it to Processor and Writer

# This is an input Json File
[
	{
		"name": "zidane",
		"nation": "france"
	},
	{
		"name": "ronaldo",
		"nation": "brazil"
	},
	{
		"name": "marcelo",
		"nation": "brazil"
	},
	{
		"name": "kross",
		"nation": "germany"
	},
	{
		"name": "maradona",
		"nation": "ar"
	},
	{
		"name": "henry",
		"nation": "french"
	},
	{
		"name": "pele",
		"nation": "brazil"
	},
	{
		"name": "canavaro",
		"nation": "italy"
	},
	{
		"name": "nesta",
		"nation": "italy"
	},
	{
		"name": "buffon",
		"nation": "italy"
	},
	{
		"name": "kaka",
		"nation": "brazil"
	},
	{
		"name": "xavi",
		"nation": "spain"
	}
]

# This is the output at console (commit-interval is 5)
2018-04-08 11:55:50,609 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=zidane, nation=france]'
2018-04-08 11:55:50,609 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=ronaldo, nation=brazil]'
2018-04-08 11:55:50,610 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=marcelo, nation=brazil]'
2018-04-08 11:55:50,610 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=kross, nation=germany]'
2018-04-08 11:55:50,610 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=maradona, nation=ar]'
2018-04-08 11:55:50,612 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=zidane, nation=france]
2018-04-08 11:55:50,613 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=ronaldo, nation=brazil]
2018-04-08 11:55:50,613 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=marcelo, nation=brazil]
2018-04-08 11:55:50,613 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=kross, nation=germany]
2018-04-08 11:55:50,613 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=maradona, nation=ar]
2018-04-08 11:55:50,615 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=henry, nation=french]'
2018-04-08 11:55:50,616 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=pele, nation=brazil]'
2018-04-08 11:55:50,616 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=canavaro, nation=italy]'
2018-04-08 11:55:50,616 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=nesta, nation=italy]'
2018-04-08 11:55:50,616 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=buffon, nation=italy]'
2018-04-08 11:55:50,616 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=henry, nation=french]
2018-04-08 11:55:50,616 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=pele, nation=brazil]
2018-04-08 11:55:50,616 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=canavaro, nation=italy]
2018-04-08 11:55:50,616 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=nesta, nation=italy]
2018-04-08 11:55:50,616 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=buffon, nation=italy]
2018-04-08 11:55:50,618 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=kaka, nation=brazil]'
2018-04-08 11:55:50,618 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleProcessor;13) Processing 'Number SoccerJsonEntry [name=xavi, nation=spain]'
2018-04-08 11:55:50,619 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=kaka, nation=brazil]
2018-04-08 11:55:50,619 INFO (com.itservicesdepot.example.springbatch.jsonreader.ExampleWriter;16) Writing SoccerJsonEntry [name=xavi, nation=spain]
