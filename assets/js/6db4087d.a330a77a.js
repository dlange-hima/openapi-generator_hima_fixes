"use strict";(self.webpackChunk=self.webpackChunk||[]).push([[7952],{3905:function(e,t,n){n.d(t,{Zo:function(){return c},kt:function(){return m}});var a=n(7294);function r(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function i(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);t&&(a=a.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,a)}return n}function o(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?i(Object(n),!0).forEach((function(t){r(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):i(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}function l(e,t){if(null==e)return{};var n,a,r=function(e,t){if(null==e)return{};var n,a,r={},i=Object.keys(e);for(a=0;a<i.length;a++)n=i[a],t.indexOf(n)>=0||(r[n]=e[n]);return r}(e,t);if(Object.getOwnPropertySymbols){var i=Object.getOwnPropertySymbols(e);for(a=0;a<i.length;a++)n=i[a],t.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(e,n)&&(r[n]=e[n])}return r}var s=a.createContext({}),p=function(e){var t=a.useContext(s),n=t;return e&&(n="function"==typeof e?e(t):o(o({},t),e)),n},c=function(e){var t=p(e.components);return a.createElement(s.Provider,{value:t},e.children)},d="mdxType",u={inlineCode:"code",wrapper:function(e){var t=e.children;return a.createElement(a.Fragment,{},t)}},h=a.forwardRef((function(e,t){var n=e.components,r=e.mdxType,i=e.originalType,s=e.parentName,c=l(e,["components","mdxType","originalType","parentName"]),d=p(n),h=r,m=d["".concat(s,".").concat(h)]||d[h]||u[h]||i;return n?a.createElement(m,o(o({ref:t},c),{},{components:n})):a.createElement(m,o({ref:t},c))}));function m(e,t){var n=arguments,r=t&&t.mdxType;if("string"==typeof e||r){var i=n.length,o=new Array(i);o[0]=h;var l={};for(var s in t)hasOwnProperty.call(t,s)&&(l[s]=t[s]);l.originalType=e,l[d]="string"==typeof e?e:r,o[1]=l;for(var p=2;p<i;p++)o[p]=n[p];return a.createElement.apply(null,o)}return a.createElement.apply(null,n)}h.displayName="MDXCreateElement"},1372:function(e,t,n){n.r(t),n.d(t,{assets:function(){return c},contentTitle:function(){return s},default:function(){return h},frontMatter:function(){return l},metadata:function(){return p},toc:function(){return d}});var a=n(7462),r=n(3366),i=(n(7294),n(3905)),o=["components"],l={id:"faq-generators",title:"FAQ: Generators"},s=void 0,p={unversionedId:"faq-generators",id:"faq-generators",title:"FAQ: Generators",description:"What are some server generator use cases?",source:"@site/../docs/faq-generators.md",sourceDirName:".",slug:"/faq-generators",permalink:"/docs/faq-generators",draft:!1,editUrl:"https://github.com/OpenAPITools/openapi-generator/edit/master/website/../docs/faq-generators.md",tags:[],version:"current",lastUpdatedBy:"devhl-labs",lastUpdatedAt:1644217607,formattedLastUpdatedAt:"Feb 7, 2022",frontMatter:{id:"faq-generators",title:"FAQ: Generators"},sidebar:"faq-sidebar",previous:{title:"FAQ: Contributing",permalink:"/docs/faq-contributing"}},c={},d=[{value:"What are some server generator use cases?",id:"what-are-some-server-generator-use-cases",level:3},{value:"Java",id:"java",level:2},{value:"The API client has SSL errors due to an invalid certificate. Is there a way to bypass that?",id:"the-api-client-has-ssl-errors-due-to-an-invalid-certificate-is-there-a-way-to-bypass-that",level:3},{value:"How can I customize the Feign client templates?",id:"how-can-i-customize-the-feign-client-templates",level:3},{value:"Android",id:"android",level:2},{value:"How can I generate an Android SDK?",id:"how-can-i-generate-an-android-sdk",level:3},{value:"C-Sharp",id:"c-sharp",level:2},{value:"How do I fix <code>CSC:  warning CS2002</code> in Xamarin?",id:"how-do-i-fix-csc--warning-cs2002-in-xamarin",level:3},{value:"Objective-C",id:"objective-c",level:2},{value:"How do I run integration test with Petstore ObjC API client?",id:"how-do-i-run-integration-test-with-petstore-objc-api-client",level:3},{value:"Swift",id:"swift",level:2},{value:"How do I run integration test with Petstore Swift API client?",id:"how-do-i-run-integration-test-with-petstore-swift-api-client",level:3},{value:"Is Swift (2.x) generator still actively maintained?",id:"is-swift-2x-generator-still-actively-maintained",level:3},{value:"TypeScript",id:"typescript",level:2},{value:"The JSON response fails to deserialize due to change in variable naming (snake_case to camelCase). Is there any way to keep the original naming?",id:"the-json-response-fails-to-deserialize-due-to-change-in-variable-naming-snake_case-to-camelcase-is-there-any-way-to-keep-the-original-naming",level:3}],u={toc:d};function h(e){var t=e.components,n=(0,r.Z)(e,o);return(0,i.kt)("wrapper",(0,a.Z)({},u,n,{components:t,mdxType:"MDXLayout"}),(0,i.kt)("h3",{id:"what-are-some-server-generator-use-cases"},"What are some server generator use cases?"),(0,i.kt)("p",null,"We have around 40+ server generators, with more added regularly. Some of these include Spring in your choice of Java or Kotlin, the Finch and Scalatra frameworks using Scala, and C# generators for ASP.NET and Azure Functions (to name only a few)."),(0,i.kt)("p",null,"Besides generating the server code as a starting point to implement the API backend, here are some use cases of the server generators:"),(0,i.kt)("ul",null,(0,i.kt)("li",{parentName:"ul"},(0,i.kt)("strong",{parentName:"li"},"prototyping")," - one can generate the server code and have a functional API backend very quickly to try different things or features."),(0,i.kt)("li",{parentName:"ul"},(0,i.kt)("strong",{parentName:"li"},"mocking")," - easily provide an API backend for mocking based on the examples field defined in the response object."),(0,i.kt)("li",{parentName:"ul"},(0,i.kt)("strong",{parentName:"li"},"migration")," - let's say one wants to migrate an API backend from Ruby on Rails to Java Spring. The server generator can save a lot of time in implementing and verify each endpoint in the new API backend."),(0,i.kt)("li",{parentName:"ul"},(0,i.kt)("strong",{parentName:"li"},"evaluating"),' - when you want to try a new language or framework, and a typical "Hello, World" is too trivial.')),(0,i.kt)("h2",{id:"java"},"Java"),(0,i.kt)("h3",{id:"the-api-client-has-ssl-errors-due-to-an-invalid-certificate-is-there-a-way-to-bypass-that"},"The API client has SSL errors due to an invalid certificate. Is there a way to bypass that?"),(0,i.kt)("p",null,"Yes, please refer to ",(0,i.kt)("a",{parentName:"p",href:"http://stackoverflow.com/a/6055903/677735"},"http://stackoverflow.com/a/6055903/677735")),(0,i.kt)("h3",{id:"how-can-i-customize-the-feign-client-templates"},"How can I customize the Feign client templates?"),(0,i.kt)("p",null,"You will need to provide customized files in ",(0,i.kt)("inlineCode",{parentName:"p"},"Java/libraries/feign")," under the resources folder and pass the location via the ",(0,i.kt)("inlineCode",{parentName:"p"},"-t")," option."),(0,i.kt)("p",null,"In your Gradle build script, please add the following (example):"),(0,i.kt)("pre",null,(0,i.kt)("code",{parentName:"pre"},"config.templateDir = 'src/openapi-generator-templates/Java/libraries/feign\n")),(0,i.kt)("h2",{id:"android"},"Android"),(0,i.kt)("h3",{id:"how-can-i-generate-an-android-sdk"},"How can I generate an Android SDK?"),(0,i.kt)("p",null,(0,i.kt)("strong",{parentName:"p"},"The Java SDK is also compatible with Android.")),(0,i.kt)("p",null,"[RECOMMENDED]"," To generate the Java SDK with ",(0,i.kt)("inlineCode",{parentName:"p"},"okhttp")," and ",(0,i.kt)("inlineCode",{parentName:"p"},"gson")," libraries, run the following:"),(0,i.kt)("pre",null,(0,i.kt)("code",{parentName:"pre"},"mvn clean package\njava -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar generate \\\n  -i https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/modules/openapi-generator/src/test/resources/3_0/petstore.json \\\n  -l java --library=okhttp-gson \\\n  --additional-properties hideGenerationTimestamp=true \\\n  -o /var/tmp/java/okhttp-gson/ \n")),(0,i.kt)("p",null,"You can also generate the Java SDK with other HTTP libraries by replacing ",(0,i.kt)("inlineCode",{parentName:"p"},"okhttp-gson")," with ",(0,i.kt)("inlineCode",{parentName:"p"},"retrofit")," for example. For a list of support libraries, please run"),(0,i.kt)("pre",null,(0,i.kt)("code",{parentName:"pre"},"java -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar config-help -l java\n")),(0,i.kt)("p",null,"To generate the Android SDK with ",(0,i.kt)("a",{parentName:"p",href:"https://github.com/mcxiaoke/android-volley"},(0,i.kt)("inlineCode",{parentName:"a"},"volley")),", please run"),(0,i.kt)("pre",null,(0,i.kt)("code",{parentName:"pre"},"mvn clean package\njava -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar generate \\\n  -i https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/modules/openapi-generator/src/test/resources/3_0/petstore.json \\\n  -l android --library=volley \\\n  -o /var/tmp/android/volley/ \n")),(0,i.kt)("p",null,"We do ",(0,i.kt)("strong",{parentName:"p"},"not")," recommend using the default HTTP library (Apache HttpClient) with ",(0,i.kt)("inlineCode",{parentName:"p"},"android")," as it's not actively maintained."),(0,i.kt)("h2",{id:"c-sharp"},"C-Sharp"),(0,i.kt)("h3",{id:"how-do-i-fix-csc--warning-cs2002-in-xamarin"},"How do I fix ",(0,i.kt)("inlineCode",{parentName:"h3"},"CSC:  warning CS2002")," in Xamarin?"),(0,i.kt)("p",null,"The full warning might look like this: ",(0,i.kt)("inlineCode",{parentName:"p"},"CSC:  warning CS2002: Source file 'Api/FakeApi.cs' specified multiple times")),(0,i.kt)("p",null,"The warning has no impact on the build process so you should be able to build the solution without issue. The warning should be addressed in the upcoming stable release of Xamarin. "),(0,i.kt)("h2",{id:"objective-c"},"Objective-C"),(0,i.kt)("h3",{id:"how-do-i-run-integration-test-with-petstore-objc-api-client"},"How do I run integration test with Petstore ObjC API client?"),(0,i.kt)("p",null,"Here are the steps:"),(0,i.kt)("pre",null,(0,i.kt)("code",{parentName:"pre"},"git clone https://github.com/openapitools/openapi-generator.git\ncd openapi-generator/samples/client/petstore/objc/default/OpenAPIClientTests\nmvn integration-test\n")),(0,i.kt)("p",null,"Besides ",(0,i.kt)("inlineCode",{parentName:"p"},"default")," (folder) ObjC API client, there's also ",(0,i.kt)("inlineCode",{parentName:"p"},"core-data")," for another ObjC API client with ",(0,i.kt)("a",{parentName:"p",href:"https://en.wikipedia.org/wiki/Core_Data"},"Core Data support"),"."),(0,i.kt)("h2",{id:"swift"},"Swift"),(0,i.kt)("h3",{id:"how-do-i-run-integration-test-with-petstore-swift-api-client"},"How do I run integration test with Petstore Swift API client?"),(0,i.kt)("p",null,"Here are the steps:"),(0,i.kt)("pre",null,(0,i.kt)("code",{parentName:"pre"},"git clone https://github.com/openapitools/openapi-generator.git\ncd openapi-generator/samples/client/petstore/swift/default/OpenAPIClientTests\nmvn integration-test\n")),(0,i.kt)("p",null,"Besides ",(0,i.kt)("inlineCode",{parentName:"p"},"default")," (folder), there's another folder ",(0,i.kt)("inlineCode",{parentName:"p"},"promisekit")," for Swift API client with ",(0,i.kt)("a",{parentName:"p",href:"https://github.com/mxcl/PromiseKit"},"PromiseKit support")),(0,i.kt)("pre",null,(0,i.kt)("code",{parentName:"pre"},"git clone https://github.com/openapitools/openapi-generator.git\ncd openapi-generator/samples/client/petstore/swift/promisekit/OpenAPIClientTests\nmvn integration-test\n")),(0,i.kt)("h3",{id:"is-swift-2x-generator-still-actively-maintained"},"Is Swift (2.x) generator still actively maintained?"),(0,i.kt)("p",null,"No, please use ",(0,i.kt)("inlineCode",{parentName:"p"},"swift3")," or ",(0,i.kt)("inlineCode",{parentName:"p"},"swift4")," generator instead as we want to focus on Swift 3.x, 4.x."),(0,i.kt)("h2",{id:"typescript"},"TypeScript"),(0,i.kt)("h3",{id:"the-json-response-fails-to-deserialize-due-to-change-in-variable-naming-snake_case-to-camelcase-is-there-any-way-to-keep-the-original-naming"},"The JSON response fails to deserialize due to change in variable naming (snake_case to camelCase). Is there any way to keep the original naming?"),(0,i.kt)("p",null,"Yes, please use the following option when generating TypeScript clients:"),(0,i.kt)("pre",null,(0,i.kt)("code",{parentName:"pre"},"    modelPropertyNaming\n        Naming convention for the property: 'camelCase', 'PascalCase', 'snake_case' and 'original', which keeps the original name (Default: camelCase)\n")))}h.isMDXComponent=!0}}]);