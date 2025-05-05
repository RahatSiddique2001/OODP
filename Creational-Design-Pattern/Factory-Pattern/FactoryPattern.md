`In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.`

# Implementation

We're going to create a Shape interface and concrete classes implementing the shape interface. A factory class `ShapeFactory` is definet as a next step.

`FactoryPatternDemo`, our demo class will use `ShapeFactory` to get a Shape object. It will pass information (CIRCLE / RECTANGLE / SQUARE) to `ShapeFactory` to get the type of object it needs.

