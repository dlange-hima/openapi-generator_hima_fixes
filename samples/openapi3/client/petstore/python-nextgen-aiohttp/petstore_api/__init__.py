# coding: utf-8

# flake8: noqa

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

__version__ = "1.0.0"

# import apis into sdk package
from petstore_api.api.another_fake_api import AnotherFakeApi
from petstore_api.api.default_api import DefaultApi
from petstore_api.api.fake_api import FakeApi
from petstore_api.api.fake_classname_tags123_api import FakeClassnameTags123Api
from petstore_api.api.pet_api import PetApi
from petstore_api.api.store_api import StoreApi
from petstore_api.api.user_api import UserApi

# import ApiClient
from petstore_api.api_client import ApiClient
from petstore_api.configuration import Configuration
from petstore_api.exceptions import OpenApiException
from petstore_api.exceptions import ApiTypeError
from petstore_api.exceptions import ApiValueError
from petstore_api.exceptions import ApiKeyError
from petstore_api.exceptions import ApiAttributeError
from petstore_api.exceptions import ApiException
# import models into sdk package
from petstore_api.models.additional_properties_class import AdditionalPropertiesClass
from petstore_api.models.all_of_with_single_ref import AllOfWithSingleRef
from petstore_api.models.animal import Animal
from petstore_api.models.any_of_color import AnyOfColor
from petstore_api.models.any_of_pig import AnyOfPig
from petstore_api.models.api_response import ApiResponse
from petstore_api.models.array_of_array_of_number_only import ArrayOfArrayOfNumberOnly
from petstore_api.models.array_of_number_only import ArrayOfNumberOnly
from petstore_api.models.array_test import ArrayTest
from petstore_api.models.basque_pig import BasquePig
from petstore_api.models.capitalization import Capitalization
from petstore_api.models.cat import Cat
from petstore_api.models.cat_all_of import CatAllOf
from petstore_api.models.category import Category
from petstore_api.models.class_model import ClassModel
from petstore_api.models.client import Client
from petstore_api.models.color import Color
from petstore_api.models.danish_pig import DanishPig
from petstore_api.models.deprecated_object import DeprecatedObject
from petstore_api.models.dog import Dog
from petstore_api.models.dog_all_of import DogAllOf
from petstore_api.models.dummy_model import DummyModel
from petstore_api.models.enum_arrays import EnumArrays
from petstore_api.models.enum_class import EnumClass
from petstore_api.models.enum_test import EnumTest
from petstore_api.models.file import File
from petstore_api.models.file_schema_test_class import FileSchemaTestClass
from petstore_api.models.foo import Foo
from petstore_api.models.foo_get_default_response import FooGetDefaultResponse
from petstore_api.models.format_test import FormatTest
from petstore_api.models.has_only_read_only import HasOnlyReadOnly
from petstore_api.models.health_check_result import HealthCheckResult
from petstore_api.models.list import List
from petstore_api.models.map_test import MapTest
from petstore_api.models.mixed_properties_and_additional_properties_class import MixedPropertiesAndAdditionalPropertiesClass
from petstore_api.models.model200_response import Model200Response
from petstore_api.models.model_return import ModelReturn
from petstore_api.models.name import Name
from petstore_api.models.nullable_class import NullableClass
from petstore_api.models.number_only import NumberOnly
from petstore_api.models.object_with_deprecated_fields import ObjectWithDeprecatedFields
from petstore_api.models.order import Order
from petstore_api.models.outer_composite import OuterComposite
from petstore_api.models.outer_enum import OuterEnum
from petstore_api.models.outer_enum_default_value import OuterEnumDefaultValue
from petstore_api.models.outer_enum_integer import OuterEnumInteger
from petstore_api.models.outer_enum_integer_default_value import OuterEnumIntegerDefaultValue
from petstore_api.models.outer_object_with_enum_property import OuterObjectWithEnumProperty
from petstore_api.models.pet import Pet
from petstore_api.models.pig import Pig
from petstore_api.models.read_only_first import ReadOnlyFirst
from petstore_api.models.self_reference_model import SelfReferenceModel
from petstore_api.models.single_ref_type import SingleRefType
from petstore_api.models.special_character_enum import SpecialCharacterEnum
from petstore_api.models.special_model_name import SpecialModelName
from petstore_api.models.special_name import SpecialName
from petstore_api.models.tag import Tag
from petstore_api.models.user import User
from petstore_api.models.with_nested_one_of import WithNestedOneOf
