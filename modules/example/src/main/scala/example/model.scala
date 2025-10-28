// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package example

import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.*

type UsernameConstraint = (MinLength[3] & MaxLength[20]) `DescribedAs` "Must be between 3 and 20 characters"
type Username           = Username.T
object Username extends RefinedSubtype[String, UsernameConstraint]

type AgeConstraint = (Positive & Less[150]) `DescribedAs` "Must be a positive number less than 150"
type Age           = Age.T
object Age extends RefinedSubtype[Int, AgeConstraint]

type FirstNameConstraint = Not[Blank] `DescribedAs` "First name must not be blank"
type FirstName           = FirstName.T
object FirstName extends RefinedSubtype[String, FirstNameConstraint]

type LastNameConstraint = Not[Blank] `DescribedAs` "Last name must not be blank"
type LastName           = LastName.T
object LastName extends RefinedSubtype[String, LastNameConstraint]

type EmailConstraint = Match[".*@.*\\..*"] `DescribedAs` "Must be a valid e-mail"
type Email           = Email.T
object Email extends RefinedSubtype[String, EmailConstraint]

type CountryNameConstraint = Not[Blank] `DescribedAs` "Country name must not be blank"
type CountryName           = CountryName.T
object CountryName extends RefinedSubtype[String, CountryNameConstraint]

type CountryCodeConstraint = (FixedLength[2] & LettersUpperCase) `DescribedAs` "Country name must not be blank"
type CountryCode           = CountryCode.T
object CountryCode extends RefinedSubtype[String, CountryCodeConstraint]

case class Country(code: CountryCode, name: CountryName, niceName: String)

case class User(
    firstName: Option[FirstName],
    lastName: Option[LastName],
    email: Email,
    age: Option[Age],
    country: Option[CountryCode]
)
